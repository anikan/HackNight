import org.bytedeco.javacpp.opencv_core.*;
import org.bytedeco.javacv.CanvasFrame;
import java.awt.image.BufferedImage; 
import java.io.File;
import java.io.IOException;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import javax.imageio.ImageIO;
import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacv.*;
import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_objdetect.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
public class demo {
  
    public static void main(String[] args) {
         BufferedImage img = null;
         BufferedImage img1 = null;
         try{
        	 img = ImageIO.read(new File("C:\\Users\\Nick\\workspace1\\demo\\src\\image.jpg"));
        	 img1 = ImageIO.read(new File("C:\\Users\\Nick\\workspace1\\demo\\src\\image1.jpg"));
     //Load image img1 as IplImage
        
         }catch (IOException e){
        	 
        	 
         }
       
        //create canvas frame named 'Demo'
         //final IplImage image = cvLoadImage("image.jpg");
       /////  final IplImage image1 = cvLoadImage("image1.jpg");
        ///// IplImage image2 = cvLoadImage("image1.jpg");
        // IplImage subImage;
       //  subImage = cvCloneImage(image);
       final CanvasFrame canvas = new CanvasFrame("Demo");
       final IplImage image = IplImage.createFrom(img);
       System.out.println(image.channelSeq().getString());
       final IplImage image1 = IplImage.createFrom(img1);
       System.out.println(image1.channelSeq().getString());
        IplImage image2 = cvCloneImage(image);//IplImage.create(image.width(),image.height(),IPL_DEPTH_8U,1);
        System.out.println(image2.channelSeq().getString());
        //cvThreshold(image1,image2,10,255,CV_THRESH_BINARY);
        cvAbsDiff(image1,image1,image2);
        //Show  in canvas frame
        canvas.showImage(image2);
         
        //This will close canvas frame on exit
        canvas.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);        
    }    
}