package mew_images;

public class RealImage extends ProxyImage {
    public RealImage(String filename){
        ProxyImage proxyImage = new ProxyImage(filename);
        proxyImage.display();
    }

    public RealImage() {
    }
}