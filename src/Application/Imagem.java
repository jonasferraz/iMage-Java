package Application;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Imagem {
    private ImageIcon Imagem;
    
    public Imagem(String arquivo){
        this.Imagem = new ImageIcon(arquivo);
    }

    public ImageIcon getImagem() {
        return Imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.Imagem = imagem;
    }
    
    public void setImagem(BufferedImage imagem) {
        this.Imagem = new ImageIcon(imagem);
    }
    
    public void setImagem(String caminhoArquivo) {
        this.Imagem = new ImageIcon(caminhoArquivo);
    }
    
}
