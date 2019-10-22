
package acme.features.anonymous.bulletin;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletins.Bulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBulletinCreateService implements AbstractCreateService<Anonymous, Bulletin> {

	//  Internal state-------------------------------------------------------

	@Autowired
	AnonymousBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Bulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public Bulletin instantiate(final Request<Bulletin> request) {
		assert request != null;

		Bulletin result;
		Date dateOfExpiry;

		dateOfExpiry = new GregorianCalendar(2019, Calendar.DECEMBER, 10).getTime();

		result = new Bulletin();
		result.setProduct("avocado");
		result.setDescription("Strange");
		result.setDateOfExpiry(dateOfExpiry);

		return result;
	}

	@Override
	public void unbind(final Request<Bulletin> request, final Bulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "product", "description", "dateOfExpiry");
	}

	@Override
	public void bind(final Request<Bulletin> request, final Bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<Bulletin> request, final Bulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;
	}

	@Override
	public void create(final Request<Bulletin> request, final Bulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}

}
