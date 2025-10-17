class Solution {
    public String toGoatLatin(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<arr.length;i++){
            char ch = arr[i].charAt(0);
            if("aeiouAEIOU".indexOf(ch)!=-1){
                sb.append(arr[i]);
            }
            else {
                sb.append(arr[i].substring(1)+ch);
            }
            sb.append("ma");

            for(int j = 0; j<=i;j++){
                sb.append("a");
            }
            if (i < arr.length - 1) sb.append(" ");
        }
        return sb.toString();
        

    }
}