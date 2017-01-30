package etlpac;

public interface Extractor {
    User[] extract() throws EtlFormatException, EtlInputException;
}