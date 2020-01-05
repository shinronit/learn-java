import java.net.URI;

public class Custom37 {
    public static void main (String[] args) {
        try {
            URI url = new URI("https://github.com/shinronit");
            java.awt.Desktop.getDesktop().browse(url);
            System.out.println("Web page opened in browser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

