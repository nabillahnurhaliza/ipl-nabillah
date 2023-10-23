class DeluxeCinema extends Cinema {
    public DeluxeCinema(Double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 12 / 100;
    }
}