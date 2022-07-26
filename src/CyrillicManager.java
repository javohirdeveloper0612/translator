import java.util.Scanner;

public class CyrillicManager  {

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
        System.out.println("\n\tCyrillic to Latin");
        System.out.println("--------------");
        System.out.println("| 1-Begin\t  |");
        System.out.println("| 0-Back Menu |");
        System.out.println("--------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Action: ");
        String s = scanner.next();
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Enter Number ! ");
                return -1;
            }
        }
        return Integer.parseInt(s);
    }






    public void  convertCyrillic(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Cyrillic : ");
        String message = scanner.nextLine();
        char[] abcCyr =   {' ','а','б','в','г','д','е','ё', 'ж','з', 'и','й','к','л','м','н','о','п','р','с','т','у','ф','х', 'ц','ч', 'ш','щ','ъ','ы','ь','э', 'ю','я','А','Б','В','Г','Д','Е','Ё', 'Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х', 'Ц', 'Ч','Ш', 'Щ','Ъ','Ы','Ь','Э','Ю','Я','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String[] abcLat = {" ","a","b","v","g","d","e","yo","j","z","i","y","k","l","m","n","o","p","r","c","t","u","f","h","s","ch","sh","sch","","i", "","e","yu","ya","A","B","V","G","D","E","E","Zh","Z","I","Y","K","L","M","N","O","P","R","S","T","U","F","H","Ts","Ch","Sh","Sch", "","I", "","E","Ju","Ja","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            for (int x = 0; x < abcCyr.length; x++ ) {
                if (message.charAt(i) == abcCyr[x]) {
                    builder.append(abcLat[x]);
                }
            }
        }
        System.out.println(builder);
    }
}

