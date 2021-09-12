package gov.tmo.tmokps.core.Utilities.Results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data, String message) {
        super(data, false, message);
    }

    public ErrorDataResult(T data, boolean success) {
        super(data, success);
    }

    public ErrorDataResult(String message) {
        super(null, false, message);
    }

    public ErrorDataResult() {
        super(null, false);
    }
}
