class PremiumCinema extends Cinema {
    public PremiumCinema(Double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 20 / 100;
    }
}