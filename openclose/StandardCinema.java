class StandardCinema extends Cinema {
    public StandardCinema(Double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 10 / 100;
    }
}