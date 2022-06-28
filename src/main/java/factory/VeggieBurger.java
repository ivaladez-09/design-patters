package factory;

public class VeggieBurger implements Burger {
    private Integer productId;
    private String addOns;
    private boolean combo;

    @Override
    public void prepare() {

    }

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getAddOns() {
        return addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns = addOns;
    }
}
