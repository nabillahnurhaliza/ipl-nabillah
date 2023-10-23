class Vegetable extends Product {
    @Override
    String getName() {
        return "Broccoli";
    }
    @Override
    Date getExpiredDate() {
        return new Date();
    }
}