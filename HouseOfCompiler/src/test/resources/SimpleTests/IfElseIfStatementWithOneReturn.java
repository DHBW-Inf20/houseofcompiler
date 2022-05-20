class IfElseIfStatementWithOneReturn {

    int foo(int i) {
        int result = 0;
        if (i == 1) {
            result = 10;
        } else if (i == 2) {
            return 20;
        } else {
            result = 30;
        }
        return result;
    }

}
