package pattern.proxy.virtual;

import java.awt.*;
import java.net.URL;
import javax.swing.*;

/**
 * @author NNroc
 * @date 2020/8/18 15:34
 */
public class ImageProxy implements Icon {
    // imageIcon是我们希望加载后显示出来的真正图象
    volatile ImageIcon imageIcon;
    final URL imageURL;
    Thread retrievalThread;
    // 是否已经下载完毕
    boolean retrieving = false;

    // url图像的位置
    public ImageProxy(URL url) {
        imageURL = url;
    }

    // 图象加载完毕前，返回默认的宽度，否则返回真实的宽度
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    // 图象加载完毕前，返回默认的高度，否则返回真实的高度
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    // 绘制图象的方法
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            // 如果图象加载完毕，则通知图象绘制自己
            imageIcon.paintIcon(c, g, x, y);
        } else {
            // 无图像则显示Loading
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;

                retrievalThread = new Thread(new Runnable() {
                    public void run() {
                        try {
                            setImageIcon(new ImageIcon(imageURL, "CD Cover"));
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }
}