package fr.concord.bff.user.model;

import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepositoryBase;
import io.crnk.core.resource.list.ResourceList;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class UserRepository extends ResourceRepositoryBase<User, String> {

	private final Map<String, User> users = new HashMap<>();

	public UserRepository() {
		super(User.class);
		users.put("0", new User("0", "Adrien"));
		users.put("1", new User("2", "Adrien2"));
		users.put("2", new User("1", "Adrien3"));
	}

	@Override
	public ResourceList<User> findAll(final QuerySpec querySpec) {
		return querySpec.apply(users.values());
	}
}
