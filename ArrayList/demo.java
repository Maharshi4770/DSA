class demo {

    public static int count(int a[]){
        int count = 1;
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++)
            if (a[i] != a[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        count(a);
    }
}