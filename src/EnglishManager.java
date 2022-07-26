import java.util.Scanner;

public class EnglishManager {

    public void star(){

        while (true){
            int action=showMenuGetAction();
            switch (action){
                case 1:
                    convertCyrillic();
                    break;
                case 0:
                    return;
            }

        }
    }


    public static int showMenuGetAction(){
        System.out.println("\n\tLatin to Cyrill");
        System.out.println("--------------");
        System.out.println("| 1-Begin\t  |");
        System.out.println("| 0-Back Menu |");
        System.out.println("--------------");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Action: ");
        String s = scanner.next();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Enter Number: ");
                return -1;
            }
        }
        return Integer.parseInt(s);
    }






        public void  convertCyrillic(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Latin message : ");
            String message = scanner.nextLine();
            char[] abcLat = {' ','a','b','v','g','d',']','e', 'j','z','y','i','k','l','q','m','n','w','o','p','r','s','t','u', 'f','h','c','x','{', 'A','B','V','G','D','}','E', 'J','Z','Y','I','K','L','Q','M','N','W','O','P','R','S','T', 'K', 'U','F', 'H','C',':','X','{','1','2','3','4','5','6','7','8','9','/','-'};
            String [] abcCyr={" ","а","б","в","г","д","ѓ","е", "ж","з","й","и","к","л","қ","м","н","w","о","п","р","с","т","у", "ф","ҳ","ц","х","ш", "А","Б","В","Г","Д","Ѓ","Е", "Ж","З","Ѕ","И","К","Л","Љ","М","Н","Њ","О","П","Р","С","Т", "Ќ","У","Ф", "Х","Ц","Ч","Џ","Ш","1","2","3","4","5","6","7","8","9","/","-"};
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                for (int x = 0; x < abcLat.length; x++ ) {
                    if (message.charAt(i) == abcLat[x]) {
                        builder.append(abcCyr[x]);
                    }
                }
            }
            System.out.println(builder);

        }
    }


    /*
//          char[] abcLat = {' ','а','б','в','г','д','ѓ','е', 'ж','з','ѕ','и','ј','к','л','љ','м','н','њ','о','п','р','с','т', 'ќ','у', 'ф','х','ц','ч','џ','ш', 'А','Б','В','Г','Д','Ѓ','Е', 'Ж','З','Ѕ','И','Ј','К','Л','Љ','М','Н','Њ','О','П','Р','С','Т', 'Ќ', 'У','Ф', 'Х','Ц','Ч','Џ','Ш','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','/','-'};
*/

