package dummy.calc.embedded.service.impl;


import dummy.calc.embedded.service.CalcService;

public class CalcServiceImpl implements CalcService {

    public String processNumberTypeOperation(String term1, String term2, String operation) {
        String response = null;

// ToDo
//        int i = Integer.parseInt("123");
//        long l = Long.parseLong("123");
//        float f = Float.parseFloat("123.4");
//        double d = Double.parseDouble("123.4e10");

        long l = 0;

        if (operation.equals("divide")) {

            l = Long.parseLong(term1) / Long.parseLong(term2);

        } else {
            l = Long.parseLong(term1) * Long.parseLong(term2);

        }
        return response = Long.toString(l);
    }
}
