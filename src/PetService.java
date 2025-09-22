class PetService {
    public double calculateFee() {
        return 50.0; // basic checkup
    }
    public double calculateFee(boolean withVaccination) {
        return 75.0; // checkup + vaccination
    }
    public double calculateFee(boolean withVaccination, boolean withGrooming) {
        return 105.0; // full service
    }
    public double calculateFee(String emergency) {
        return 200.0; // emergency
    }
}