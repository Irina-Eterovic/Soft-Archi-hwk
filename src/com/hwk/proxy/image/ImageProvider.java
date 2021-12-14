package com.hwk.proxy.image;

public class ImageProvider implements IImageAccesor {



    private Image getSomeImage(String id) {
        System.out.println("Downloading image... ");
        Image image;
        experienceNetworkLatency();
        if(id == "dangerous"){
             image = new Image(id, "Something not so nice", Classification.ADULT);
        }
        else {
            image = new Image(id, "A donut", Classification.FOOD);
        }
        System.out.println("Done downloading image");
        return image;
    }
    private void establishConnection(String route) {
        System.out.println("Connecting to " + route + "... ");
        experienceNetworkLatency();
        System.out.println("Connected!");
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    @Override
    public Image getImage(String id, Integer age) {
        return getSomeImage(id);
    }

}
