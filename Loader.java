package etlpac;

public interface Loader {
    void load(User[] users) throws EtlLoaderException;
}
