//package multithreadingrealproblem;
//
//
//import java.io.File;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
//import javax.imageio.ImageIO;
//
//class ImageTask implements Runnable {
//
//    private final String imageName;
//
//    public ImageTask(String imageName) {
//        this.imageName = imageName;
//    }
//
//    @Override
//    public void run() {
//
//        try {
//
//            BufferedImage image =
//                    ImageIO.read(new File("images/" + imageName));
//
//            for (int y = 0; y < image.getHeight(); y++) {
//
//                for (int x = 0; x < image.getWidth(); x++) {
//
//                    Color color =
//                            new Color(image.getRGB(x, y));
//
//                    int gray =
//                            (color.getRed()
//                                    + color.getGreen()
//                                    + color.getBlue()) / 3;
//
//                    Color grayColor =
//                            new Color(gray, gray, gray);
//
//                    image.setRGB(
//                            x,
//                            y,
//                            grayColor.getRGB());
//                }
//            }
//
//            ImageIO.write(
//                    image,
//                    "jpg",
//                    new File("processed/gray_" + imageName));
//
//            System.out.println(
//                    Thread.currentThread().getName()
//                            + " processed "
//                            + imageName);
//
//        } catch (Exception e) {
//
//            System.out.println(
//                    "Failed : "
//                            + imageName);
//
//            e.printStackTrace();
//        }
//    }
//}
//
//public class ParallelImageProcessing {
//
//    public static void main(String[] args)
//            throws Exception {
//
//        ExecutorService executor =
//                Executors.newFixedThreadPool(3);
//
//        String[] images = {
//
//                "image1.jpg",
//                "image2.jpg",
//                "image3.jpg",
//                "image4.jpg",
//                "image5.jpg"
//        };
//
//        for (String image : images) {
//
//            executor.execute(
//                    new ImageTask(image));
//        }
//
//        executor.shutdown();
//
//        executor.awaitTermination(
//                5,
//                TimeUnit.MINUTES);
//
//        System.out.println("\nAll Images Processed.");
//    }
//}