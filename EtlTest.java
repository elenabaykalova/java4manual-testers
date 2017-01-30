package etlpac;

public class EtlTest {
    public static void main(String[] args) throws TestFailException {
        try {
            new EtlController(
                    new FileCsvExtractor(),
                    new Loader[] {
                    }
            ).doEtl();
        } catch (EtlException e) {
            throw new TestFailException("ETL test fail exception message", e);
//            return;
        }
    }
}
