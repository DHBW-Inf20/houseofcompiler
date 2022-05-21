class RealWhile {

    int foo(int i) {
        int result = 0;
        while (i > 0) {
            result = result + 2;
            i = i - 1;
        }
        return result;
    }

}
