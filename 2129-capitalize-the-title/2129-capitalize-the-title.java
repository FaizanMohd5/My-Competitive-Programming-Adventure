class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder str = new StringBuilder();
        String[] arr = title.split(" ");
        for (String s : arr)
        {
            if (s.length() <= 2 ) {
                str.append(s.toLowerCase() + " ");
            }else {
                str.append(s.substring(0, 1).toUpperCase());
                str.append(s.substring(1).toLowerCase() + " ");
            }
        }
        return str.toString().trim();
    }
}