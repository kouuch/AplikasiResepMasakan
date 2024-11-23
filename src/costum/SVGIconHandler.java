package costum;

import javax.swing.ImageIcon;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class SVGIconHandler {
    public static ImageIcon getSVGIcon(String svgPath, int width, int height) throws IOException, TranscoderException {
        InputStream svgFile = SVGIconHandler.class.getClassLoader().getResourceAsStream(svgPath);
        if (svgFile == null) {
            throw new IOException("SVG file not found: " + svgPath);
        }

        final BufferedImage[] imageHolder = new BufferedImage[1];

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

        transcoder.addTranscodingHint(ImageTranscoder.KEY_WIDTH, (float) width);
        transcoder.addTranscodingHint(ImageTranscoder.KEY_HEIGHT, (float) height);

        transcoder.transcode(new TranscoderInput(svgFile), null);
        return new ImageIcon(imageHolder[0]);
    }
}
