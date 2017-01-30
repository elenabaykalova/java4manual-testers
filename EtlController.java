package etlpac;

public class EtlController {
    private Extractor extractor;
    private Loader[] loaders;

    public EtlController(Extractor extractor, Loader[] loaders) {
        this.extractor = extractor;
        this.loaders = loaders;
    }

    public void doEtl() throws EtlException {
        final User[] extractedUsers;
        try {
            //....
            extractedUsers = extractor.extract();
        } catch (EtlInputException e) {
            throw new EtlException("ETL problem, data parsing issues", e, 5);
        } catch (EtlFormatException e) {
            throw new EtlException("ETL problem, data format is incorrect", e, 5);
        }
        if (loaders != null) {
            for (Loader loader : loaders) {
                try {
                    loader.load(extractedUsers);
                } catch (EtlLoaderException e) {
                    throw new EtlException("ETL problem, data load failed", e, 5);
                }
                //...
//            return; //block finally will be executed
                catch (RuntimeException e) {
//            e.printStackTrace();
                    throw new EtlException("ETL problem, please contact support team", e, 5);
                }
            }
//        catch (Exception e) { }
//        finally {
//            throw new RuntimeException("Performed actions didn't solve your issue, please send stack trace to support team")
        }
    }
}