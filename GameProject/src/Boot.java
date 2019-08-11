import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Boot {
    public Boot() {

        BeginSession();

        Texture t = LoadTexture("res/dirt64.png", "PNG");

        while(!Display.isCloseRequested()) {

            DrawQuadTex(t,0, 0,64,64);

            Display.update();
            Display.sync(60);
        }
        Display.destroy();
    }

    public static void main(String[] args) {
        new Boot();
                }
                }
