package cafe.axolotlcafe.core.utilities.results;

public class SuccesDataResult<T> extends DataResult<T>{
	
	public SuccesDataResult() {
		super(null, true);
	}
	
	public SuccesDataResult(String message) {
		super(null, true, message);
	}
	
	public SuccesDataResult(T data) {
 		super(data, true);
	}
	
	public SuccesDataResult(T data, String message) {
		super(data, true, message);
	}
}
