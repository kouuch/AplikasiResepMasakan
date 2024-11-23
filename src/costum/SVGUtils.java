package costum;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;

public class SVGUtils {

    // Konstruktor default
    public SVGUtils() {}

    // Metode untuk memuat file SVG dan mengonversinya ke ImageIcon
    public ImageIcon loadSVGAsIcon(String svgPath, int width, int height) throws IOException, TranscoderException {
        // Memuat file SVG dari sumber daya
        InputStream svgFile = getClass().getClassLoader().getResourceAsStream(svgPath);
        if (svgFile == null) {
            throw new IOException("SVG file not found: " + svgPath);
        }

        // Tempat penyimpanan sementara gambar
        final BufferedImage[] imageHolder = new BufferedImage[1];

        // Transcoder untuk mengonversi SVG ke BufferedImage
        ImageTranscoder transcoder = new ImageTranscoder() {
            @Override
            public BufferedImage createImage(int w, int h) {
                return new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            }

            @Override
            public void writeImage(BufferedImage img, TranscoderOutput output) {
                imageHolder[0] = img;
            }
        };

        // Mengatur dimensi gambar
        transcoder.addTranscodingHint(ImageTranscoder.KEY_WIDTH, (float) width);
        transcoder.addTranscodingHint(ImageTranscoder.KEY_HEIGHT, (float) height);

        // Proses transkoding
        transcoder.transcode(new TranscoderInput(svgFile), null);
        return new ImageIcon(imageHolder[0]);
    }
}
