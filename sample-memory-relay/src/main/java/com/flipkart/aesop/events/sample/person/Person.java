/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package com.flipkart.aesop.events.sample.person;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Person extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"org.aesop.events.sample.person\",\"fields\":[{\"name\":\"key\",\"type\":[\"long\",\"null\"]},{\"name\":\"firstName\",\"type\":[\"string\",\"null\"]},{\"name\":\"lastName\",\"type\":[\"string\",\"null\"]},{\"name\":\"birthDate\",\"type\":[\"long\",\"null\"]},{\"name\":\"deleted\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.Long key;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public java.lang.Long birthDate;
  @Deprecated public java.lang.CharSequence deleted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public Person() {}

  /**
   * All-args constructor.
   */
  public Person(java.lang.Long key, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.Long birthDate, java.lang.CharSequence deleted) {
    this.key = key;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthDate = birthDate;
    this.deleted = deleted;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return firstName;
    case 2: return lastName;
    case 3: return birthDate;
    case 4: return deleted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.Long)value$; break;
    case 1: firstName = (java.lang.CharSequence)value$; break;
    case 2: lastName = (java.lang.CharSequence)value$; break;
    case 3: birthDate = (java.lang.Long)value$; break;
    case 4: deleted = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   */
  public java.lang.Long getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.Long value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'birthDate' field.
   */
  public java.lang.Long getBirthDate() {
    return birthDate;
  }

  /**
   * Sets the value of the 'birthDate' field.
   * @param value the value to set.
   */
  public void setBirthDate(java.lang.Long value) {
    this.birthDate = value;
  }

  /**
   * Gets the value of the 'deleted' field.
   */
  public java.lang.CharSequence getDeleted() {
    return deleted;
  }

  /**
   * Sets the value of the 'deleted' field.
   * @param value the value to set.
   */
  public void setDeleted(java.lang.CharSequence value) {
    this.deleted = value;
  }

  /** Creates a new Person RecordBuilder */
  public static com.flipkart.aesop.events.sample.person.Person.Builder newBuilder() {
    return new com.flipkart.aesop.events.sample.person.Person.Builder();
  }
  
  /** Creates a new Person RecordBuilder by copying an existing Builder */
  public static com.flipkart.aesop.events.sample.person.Person.Builder newBuilder(com.flipkart.aesop.events.sample.person.Person.Builder other) {
    return new com.flipkart.aesop.events.sample.person.Person.Builder(other);
  }
  
  /** Creates a new Person RecordBuilder by copying an existing Person instance */
  public static com.flipkart.aesop.events.sample.person.Person.Builder newBuilder(com.flipkart.aesop.events.sample.person.Person other) {
    return new com.flipkart.aesop.events.sample.person.Person.Builder(other);
  }
  
  /**
   * RecordBuilder for Person instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Person>
    implements org.apache.avro.data.RecordBuilder<Person> {

    private java.lang.Long key;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.Long birthDate;
    private java.lang.CharSequence deleted;

    /** Creates a new Builder */
    private Builder() {
      super(com.flipkart.aesop.events.sample.person.Person.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(com.flipkart.aesop.events.sample.person.Person.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[3].schema(), other.birthDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.deleted)) {
        this.deleted = data().deepCopy(fields()[4].schema(), other.deleted);
        fieldSetFlags()[4] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Person instance */
    private Builder(com.flipkart.aesop.events.sample.person.Person other) {
            super(com.flipkart.aesop.events.sample.person.Person.SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[3].schema(), other.birthDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.deleted)) {
        this.deleted = data().deepCopy(fields()[4].schema(), other.deleted);
        fieldSetFlags()[4] = true;
      }
    }

    /** Gets the value of the 'key' field */
    public java.lang.Long getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder setKey(java.lang.Long value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'key' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'firstName' field */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }
    
    /** Sets the value of the 'firstName' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'firstName' field has been set */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'firstName' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'lastName' field */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }
    
    /** Sets the value of the 'lastName' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'lastName' field has been set */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'lastName' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'birthDate' field */
    public java.lang.Long getBirthDate() {
      return birthDate;
    }
    
    /** Sets the value of the 'birthDate' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder setBirthDate(java.lang.Long value) {
      validate(fields()[3], value);
      this.birthDate = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'birthDate' field has been set */
    public boolean hasBirthDate() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'birthDate' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder clearBirthDate() {
      birthDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'deleted' field */
    public java.lang.CharSequence getDeleted() {
      return deleted;
    }
    
    /** Sets the value of the 'deleted' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder setDeleted(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.deleted = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'deleted' field has been set */
    public boolean hasDeleted() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'deleted' field */
    public com.flipkart.aesop.events.sample.person.Person.Builder clearDeleted() {
      deleted = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    public Person build() {
      try {
        Person record = new Person();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.Long) defaultValue(fields()[0]);
        record.firstName = fieldSetFlags()[1] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.birthDate = fieldSetFlags()[3] ? this.birthDate : (java.lang.Long) defaultValue(fields()[3]);
        record.deleted = fieldSetFlags()[4] ? this.deleted : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
