import java.io.*;
import java.util.*;

public class TxtAnalizer {
    public void txtAnaliz(File test) throws IOException {
// "Обучение" =========================================================================================================
        FileReader news_train = new FileReader("C:\\Users\\khodo\\Desktop\\news_train.txt");
        FileReader news_test = new FileReader("C:\\Users\\khodo\\Desktop\\news_test.txt");

        System.out.println("Начинаю читать файл news_train...");
        Scanner scanner = new Scanner(news_train);
        Scanner scanner2 = new Scanner(news_test);

        ArrayList<String> science = new ArrayList<>();
        ArrayList<String> style = new ArrayList<>();
        ArrayList<String> culture = new ArrayList<>();
        ArrayList<String> life = new ArrayList<>();
        ArrayList<String> economics = new ArrayList<>();
        ArrayList<String> business = new ArrayList<>();
        ArrayList<String> travel = new ArrayList<>();
        ArrayList<String> forces = new ArrayList<>();
        ArrayList<String> media = new ArrayList<>();
        ArrayList<String> sport = new ArrayList<>();

        String line = new String();
        String delimiter1 = "\t";
        String delimiter2 = " ";
        String[] tag_head_body;
        String[] words1;
        String[] words2;

        System.out.println("Начато создание множества маркеров...");
        while (scanner.hasNextLine()) {
            line = (scanner.nextLine());
            tag_head_body = line.split(delimiter1, 3);
            words1 = tag_head_body[1].split(delimiter2);
            words2 = tag_head_body[2].split(delimiter2);
            // Чистим слова ==============================
            for (int i = 0; i < words1.length; i++){
                words1[i] = words1[i].replace(",", "");
                words1[i] = words1[i].replace(".", "");
                words1[i] = words1[i].replace("<", "");
                words1[i] = words1[i].replace(">", "");
                words1[i] = words1[i].replace("(", "");
                words1[i] = words1[i].replace(")", "");
                words1[i] = words1[i].replace("}", "");
                words1[i] = words1[i].replace("{", "");
                words1[i] = words1[i].replace("]", "");
                words1[i] = words1[i].replace("[", "");
                words1[i] = words1[i].toUpperCase();
            }
            for (int i = 0; i < words2.length; i++){
                words2[i] = words2[i].replace(",", "");
                words2[i] = words2[i].replace(".", "");
                words2[i] = words2[i].replace("<", "");
                words2[i] = words2[i].replace(">", "");
                words2[i] = words2[i].replace("(", "");
                words2[i] = words2[i].replace(")", "");
                words2[i] = words2[i].replace("}", "");
                words2[i] = words2[i].replace("{", "");
                words2[i] = words2[i].replace("]", "");
                words2[i] = words2[i].replace("[", "");
                words2[i] = words2[i].toUpperCase();
            }
            // ================================================


            if (tag_head_body[0].equals("sport")) {
                sport.addAll(Arrays.asList(words1));
                sport.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    sport.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    sport.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("science")) {
                science.addAll(Arrays.asList(words1));
                science.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    science.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    science.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("style")) {
                style.addAll(Arrays.asList(words1));
                style.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    style.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    style.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("culture")) {
                culture.addAll(Arrays.asList(words1));
                culture.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    culture.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    culture.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("life")) {
                life.addAll(Arrays.asList(words1));
                life.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    life.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    life.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("economics")) {
                economics.addAll(Arrays.asList(words1));
                economics.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    economics.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    economics.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("business")) {
                business.addAll(Arrays.asList(words1));
                business.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    business.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    business.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("travel")) {
                travel.addAll(Arrays.asList(words1));
                travel.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    travel.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    travel.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("forces")) {
                forces.addAll(Arrays.asList(words1));
                forces.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    forces.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    forces.add(words2[i]);
                }

            }
            if (tag_head_body[0].equals("media")) {
                media.addAll(Arrays.asList(words1));
                media.addAll(Arrays.asList(words2));
                for (int i = 0; i < words1.length; i++) {
                    media.add(words1[i]);
                }
                for (int i = 0; i < words2.length; i++) {
                    media.add(words2[i]);
                }
            }
        }
        // End of while loop.
        // Делее идет конвертация массивов в множества для дедубликации и дальнейшей работы.

        final HashSet<String> sportSet_marker = new HashSet<>(sport);
        final HashSet<String> scienceSet_marker = new HashSet<>(science);
        final HashSet<String> cultureSet_marker = new HashSet<>(culture);
        final HashSet<String> lifeSet_marker = new HashSet<>(life);
        final HashSet<String> forcesSet_marker = new HashSet<>(forces);
        final HashSet<String> businessSet_marker = new HashSet<>(business);
        final HashSet<String> economicsSet_marker = new HashSet<>(economics);
        final HashSet<String> styleSet_marker = new HashSet<>(style);
        final HashSet<String> mediaSet_marker = new HashSet<>(media);
        final HashSet<String> travelSet_marker = new HashSet<>(travel);
        System.out.println("Первичные множества маркеров созданы...");

        HashSet<String> styleSet_marker_copy = new HashSet<>(styleSet_marker);
        HashSet<String> sportSet_marker_copy = new HashSet<>(sportSet_marker);
        HashSet<String> scienceSet_marker_copy = new HashSet<>(scienceSet_marker);
        HashSet<String> forcesSet_marker_copy = new HashSet<>(forcesSet_marker);
        HashSet<String> lifeSet_marker_copy = new HashSet<>(lifeSet_marker);
        HashSet<String> travelSet_marker_copy = new HashSet<>(travelSet_marker);
        HashSet<String> businessSet_marker_copy = new HashSet<>(businessSet_marker);
        HashSet<String> economicsSet_marker_copy = new HashSet<>(economicsSet_marker);
        HashSet<String> cultureSet_marker_copy = new HashSet<>(cultureSet_marker);
        HashSet<String> mediaSet_marker_copy = new HashSet<>(mediaSet_marker);

        news_train.close();
        scanner.close();
// Анализ & запись ====================================================================================================
        File output = new File("C:\\Users\\khodo\\Desktop\\test_out\\output.txt");
        try
        {
            boolean created = output.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        FileWriter fr = new FileWriter(output);


        // Analysis right here in while loop


        int iterCounter = 0;

        int styleCounter;
        int mediaCounter;
        int cultureCounter;
        int economicsCounter;
        int travelCounter;
        int sportCounter;
        int scienceCounter;
        int forcesCounter;
        int lifeCounter;
        int businessCounter;
        String[] clean = null;
        HashSet<String> cleanSet = null;
        String lineTest;


        System.out.println("Начинаю анализировать news_test...");
        while (scanner2.hasNextLine()) {

            ArrayList<String> lineArray = new ArrayList<>();
            iterCounter++;
            if (iterCounter % 100 == 0){
                System.out.println("===== Идет анализ, ожидайте =====");
            }

            lineTest = (scanner2.nextLine());
            tag_head_body = lineTest.split(delimiter1, 2);
            words1 = tag_head_body[0].split(delimiter2);
            words2 = tag_head_body[1].split(delimiter2);
            // Чистим слова ==============================
            for (int i = 0; i < words1.length; i++){
                words1[i] = words1[i].replace(",", "");
                words1[i] = words1[i].replace(".", "");
                words1[i] = words1[i].replace("<", "");
                words1[i] = words1[i].replace(">", "");
                words1[i] = words1[i].replace("(", "");
                words1[i] = words1[i].replace(")", "");
                words1[i] = words1[i].replace("}", "");
                words1[i] = words1[i].replace("{", "");
                words1[i] = words1[i].replace("]", "");
                words1[i] = words1[i].replace("[", "");
                words1[i] = words1[i].toUpperCase();
            }
            for (int i = 0; i < words2.length; i++){
                words2[i] = words2[i].replace(",", "");
                words2[i] = words2[i].replace(".", "");
                words2[i] = words2[i].replace("<", "");
                words2[i] = words2[i].replace(">", "");
                words2[i] = words2[i].replace("(", "");
                words2[i] = words2[i].replace(")", "");
                words2[i] = words2[i].replace("}", "");
                words2[i] = words2[i].replace("{", "");
                words2[i] = words2[i].replace("]", "");
                words2[i] = words2[i].replace("[", "");
                words2[i] = words2[i].toUpperCase();
            }
            // ===========================================
            lineArray.addAll(Arrays.asList(words1));
            lineArray.addAll(Arrays.asList(words2));
            HashSet<String> lineSet = new HashSet<>(lineArray);

            styleSet_marker_copy.retainAll(lineSet);
            mediaSet_marker_copy.retainAll(lineSet);
            cultureSet_marker_copy.retainAll(lineSet);
            economicsSet_marker_copy.retainAll(lineSet);
            travelSet_marker_copy.retainAll(lineSet);
            sportSet_marker_copy.retainAll(lineSet);
            forcesSet_marker_copy.retainAll(lineSet);
            scienceSet_marker_copy.retainAll(lineSet);
            lifeSet_marker_copy.retainAll(lineSet);
            businessSet_marker_copy.retainAll(lineSet);

            // Intersection calculation ===============================================================================
            styleCounter = styleSet_marker_copy.size();
            mediaCounter = mediaSet_marker_copy.size();
            cultureCounter = cultureSet_marker_copy.size();
            economicsCounter = economicsSet_marker_copy.size();
            travelCounter = travelSet_marker_copy.size();
            sportCounter = sportSet_marker_copy.size();
            scienceCounter = scienceSet_marker_copy.size();
            forcesCounter = forcesSet_marker_copy.size();
            lifeCounter = lifeSet_marker_copy.size();
            businessCounter = businessSet_marker_copy.size();
            // Restoring markers sets =================================================================================
            styleSet_marker_copy = new HashSet<>(styleSet_marker);
            sportSet_marker_copy = new HashSet<>(sportSet_marker);
            scienceSet_marker_copy = new HashSet<>(scienceSet_marker);
            forcesSet_marker_copy = new HashSet<>(forcesSet_marker);
            lifeSet_marker_copy = new HashSet<>(lifeSet_marker);
            travelSet_marker_copy = new HashSet<>(travelSet_marker);
            businessSet_marker_copy = new HashSet<>(businessSet_marker);
            economicsSet_marker_copy = new HashSet<>(economicsSet_marker);
            cultureSet_marker_copy = new HashSet<>(cultureSet_marker);
            mediaSet_marker_copy = new HashSet<>(mediaSet_marker);
            // Comparing ==============================================================================================
            HashMap<String, Integer> counters = new HashMap<>();
            counters.put("style", styleCounter);
            counters.put("forces", forcesCounter);
            counters.put("science", scienceCounter);
            counters.put("life", lifeCounter);
            counters.put("business", businessCounter);
            counters.put("travel", travelCounter);
            counters.put("economics", economicsCounter);
            counters.put("culture", cultureCounter);
            counters.put("media", mediaCounter);
            counters.put("sport", sportCounter);
            String className = Collections.max(counters.entrySet(), Map.Entry.comparingByValue()).getKey();

            fr.write(className + "\n");
        }

        scanner2.close();
        fr.close();
        System.out.println("Анализ закончен, результат записан");
    }

}
