
package acme.entities.bulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PorteroMontanoBulletin extends DomainEntity {

	// Serialisation identifier ------------------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes --------------------------------------------------------------------

	@NotBlank
	private String				description;

	@NotBlank
	private String				product;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				dateOfExpiry;

}
