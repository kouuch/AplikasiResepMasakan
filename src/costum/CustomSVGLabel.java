package costum;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JLabel;

public class CustomSVGLabel extends JLabel {

    private String svgPath; // Tambahkan properti svgPath

    public CustomSVGLabel(String svgPath, int width, int height) {
        super();
        setSvgPath(svgPath); // Gunakan setter untuk mengatur path
    }

    public CustomSVGLabel() {
        super();
    }

    // Getter dan Setter untuk svgPath
    public String getSvgPath() {
        return svgPath;
    }

    public void setSvgPath(String svgPath) {
        this.svgPath = svgPath; // Simpan path SVG
        if (svgPath != null && !svgPath.isEmpty()) {
            FlatSVGIcon svgIcon = new FlatSVGIcon(svgPath, 50, 50); // Atur ukuran default
            this.setIcon(svgIcon); // Set ikon ke JLabel
        }
    }
}
