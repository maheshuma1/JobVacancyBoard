package vacancyboard;

import java.util.List;

public class RemoteJobPostIterator implements Iterator {
	List<RemoteJobPost> jobPosts;
	int position = 0;
	public RemoteJobPostIterator(List<RemoteJobPost> jobPosts) {
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
		RemoteJobPost jobPost = jobPosts.get(position);
		position = position + 1;
		return jobPost;
	}

}