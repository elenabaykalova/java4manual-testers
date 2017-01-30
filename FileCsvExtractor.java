package etlpac;

public class FileCsvExtractor implements Extractor {
    @Override
    public User[] extract() throws EtlInputException, EtlFormatException {
        //return new User[0];
        if (true) throw new EtlInputException("No data to parse in input file");
        //...
        if (true) throw new EtlFormatException ("Illegal Format");
        return null;
        //...
    }
}
