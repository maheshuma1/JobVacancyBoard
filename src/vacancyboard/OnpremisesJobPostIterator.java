package vacancyboard;
import java.util.*;
public class OnpremisesJobPostIterator implements Iterator {
	List<OnpremisesJobPost> jobPosts;
	int position = 0;
	public OnpremisesJobPostIterator(List<OnpremisesJobPost> jobPosts) {
		this.jobPosts = jobPosts;
	}

	@Override
	public boolean hasNext() {
		if(position > jobPosts.size()) {
		return false;
		}
		else {
			return true;
		}
	}

	@Override
	public JobPost next() {
		OnpremisesJobPost jobPost = jobPosts.get(position);
		position = position + 1;
		return jobPost;
	}

}
