import java.util.Map;

class RnaTranscription {
    private Map<String, String> nucleotides = Map.of(
            "G", "C", "C", "G", "T", "A", "A", "U"
    );

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        if (dnaStrand.isEmpty())
            return rnaStrand;
        else {
            for (int i = 0; i < dnaStrand.length(); i++) {
                String dna = String.valueOf(dnaStrand.charAt(i));
                rnaStrand += nucleotides.get(dna);
            }
            return rnaStrand;
        }
    }

}
