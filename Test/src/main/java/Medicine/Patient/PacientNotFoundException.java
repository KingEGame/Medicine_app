package Medicine.Patient;

class PacientNotFoundException extends RuntimeException {

    PacientNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}