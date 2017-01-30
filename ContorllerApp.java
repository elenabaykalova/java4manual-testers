package etlpac;

public class ContorllerApp {
    public static void main(String[] args) throws EtlException {
        new EtlController(
                new FileCsvExtractor(),
                new Loader[] {new FileXmlLoader(), new FileXmlLoader()}
        ).doEtl();
    }
}