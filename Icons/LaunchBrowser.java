
package socialw.Icons;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;

/**
 *
 * @author Dell
 */
public class LaunchBrowser {
    
    public void Launchfacebook(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.facebook.com"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchinstagram(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.instagram.com"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchtwitter(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.twitter.com"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchamazon(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.amazon.in"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchflipkart(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.flipkart.com"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchyoutube(){
        try 
        {
            Desktop.getDesktop().browse(URI.create("www.youtube.com"));
        } 
        catch (IOException e) 
        {
        }
    }
    public void Launchweather(){
            try 
            {
                Desktop.getDesktop().browse(URI.create("www.accuweather.com"));
            } 
            catch (IOException e) 
            {
            }
        }    
        public void Launchclock(){
            try 
            {
                Desktop.getDesktop().browse(URI.create("www.timeanddate.com/worldclock/"));
            } 
            catch (IOException e) 
            {
            }
        }

    
}
