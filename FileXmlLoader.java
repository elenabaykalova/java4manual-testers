package etlpac;

public class FileXmlLoader implements Loader {
    @Override
    public void load(User[] users) throws EtlLoaderException {
        //return new User[0];
        if (true) throw new EtlLoaderException("An error occurred when loading data");
        //...
    }
}
