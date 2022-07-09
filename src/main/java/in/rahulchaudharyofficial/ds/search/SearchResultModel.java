package in.rahulchaudharyofficial.ds.search;

public class SearchResultModel<T> {
    private ResponseStatus status;
    private T model;
    private int position;

    public SearchResultModel() {
        this.status = ResponseStatus.ERROR;
        this.model = null;
        this.position = -1;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "SearchResultModel{" +
                "status=" + status +
                ", model=" + model +
                ", position=" + position +
                '}';
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}
