class Solution {
    public double[] convertTemperature(double celsius) {

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        double[] ans;
        ans = new double[]{kelvin, fahrenheit};

        return ans;

    }
}

void main() {
    Solution sol = new Solution();
    double[] result1 = sol.convertTemperature(36.50);
    System.out.println("Input: 36.50");
    System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]");

    double[] result2 = sol.convertTemperature(0.00);
    System.out.println("Input: 0.00");
    System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]");

    double[] result3 = sol.convertTemperature(-40.00);
    System.out.println("Input: -40.00");
    System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]");
}
