package seedu.address.testutil;

import seedu.address.commons.exceptions.IllegalValueException;
import seedu.address.model.AddressBook;
import seedu.address.model.person.ReadOnlyPerson;
import seedu.address.model.person.exceptions.DuplicatePersonException;
import seedu.address.model.tag.Tag;

/**
 * A utility class to help with building Addressbook objects.
 * Example usage: <br>
 *     {@code AddressBook ab = new AddressBookBuilder().withPerson("John", "Doe").withTag("Friend").build();}
 */
public class AddressBookBuilder {

    private AddressBook addressBook;

    public AddressBookBuilder() {
        addressBook = new AddressBook();
    }

    public AddressBookBuilder(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    /**
     * Adds a new {@code Person} to the {@code AddressBook} that we are building.
     * @throws DuplicatePersonException if the {@code person} already exists in the building Addressbook.
     */
    public AddressBookBuilder withPerson(ReadOnlyPerson person) throws DuplicatePersonException {
        addressBook.addPerson(person);
        return this;
    }

    /**
     * Parses {@code tagName} into a {@code Tag} and adds it to the {@code AddressBook} that we are building.
     * @throws IllegalValueException if the {@code tagName} is invalid.
     */
    public AddressBookBuilder withTag(String tagName) throws IllegalValueException {
        addressBook.addTag(new Tag(tagName));
        return this;
    }

    public AddressBook build() {
        return addressBook;
    }
}
