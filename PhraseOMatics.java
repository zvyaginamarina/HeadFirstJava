public class PhraseOMatics {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7", "3-tier", "30,000-foot", "mutual", "win-win", "frontend", "web-based", "pervasive", "smart", "six sigma", "critical path method", "dynamic"};
        String[] wordListTwo = {"empowered", "challenging", "clean product", "focused", "central", "distributed", "clustered", "branded", "out-of-the-box thinking", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "collaborative", "accelerated"};
        String[] wordListThree = {"process", "drop-off point", "way out", "structure type", "talent", "approach", "level of attention gained", "portal", "time period", "overview", "sample", "follow-up point"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("All we need is - " + phrase);

        }
     }



