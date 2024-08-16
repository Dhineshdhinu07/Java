public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
//        System.out.println(countSeniors(details));
        countSeniors(details);
    }

    private static void countSeniors(String[] details) {
        int seniorCount = 0;
        String str = "";
        int i = 11;
        for (int k = 0; k < details.length; k++) {
            while(i <= 12){
//                if(i > 12 ) break;
                str = str + details[k].charAt(i);
                if(Integer.parseInt(str) > 60){
                    seniorCount++;
                }
                i++;
            }
            str = "";
            i = 11;
        }
        System.out.println(seniorCount);

//        for(int i = 11; i < details[0].length()-2; i++){
//            str = str + details[0].charAt(i);
//            if(Integer.parseInt(str) > 60){
//                seniorCount++;
//            }
//        }
//        System.out.println(seniorCount);
    }
}
