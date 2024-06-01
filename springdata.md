#this is spring data file

JPA (Java Persistence API)
Role: JPA is a specification that defines how to map Java objects to relational database tables and how to manage those objects. It provides a standard approach for object-relational mapping (ORM) in Java applications, but it doesn't provide an implementation itself
What is a Specification?
In software engineering, a specification is a detailed, formal description of how a system or component should behave.
It sets out the standards, guidelines, or rules that must be followed by any implementation that adheres to that specification. In this context, JPA is a specification
JPA as a Specification
JPA (Java Persistence API) is a specification provided by the Java Community Process (JCP). It defines the standard for object-relational mapping in Java applications. However, JPA itself does not include any implementation. Instead, it describes how ORM should be done, outlining the interfaces and annotations that should be used.

Key Components of the JPA Specification
 Entities: Defines how to map Java classes to database tables
 EntityManager: Manages the lifecycle of entities.Interface for interacting with the persistence context (similar to a session in Hibernate).
 EntityTransaction: Manages transactions.
 Persistence Unit: Represents a collection of entity classes that are managed by an EntityManager. or Configuration details for the entity manager.
 EntityManagerFactory: Creates EntityManager instances.
 Query: Defines how to retrieve data from the database.
 JPQL (Java Persistence Query Language): Defines how to write queries in JPA.
 Criteria API: Provides a type-safe way to define queries programmatically.
 JPA Implementations
Hibernate: The most popular JPA implementation. It is a high-performance, feature-rich ORM framework that provides a powerful implementation of the JPA specification.

ORM Framework (e.g., Hibernate)
Role:
Provides the actual implementation of the JPA specification.
Handles object-relational mapping and offers additional features.
Key Features:
Session Management: Lifecycle of persistence contexts.
Lazy Loading: Efficiently fetches related entities only when accessed.
Caching: First-level and second-level caching to improve performance.
Advanced Querying: Extends JPA with additional query capabilities

Spring Data JPA
Role:
Simplifies the use of JPA and ORM frameworks.
Provides repository abstractions to reduce boilerplate code.
Integrates seamlessly with the Spring ecosystem.
Key Features:
Repository Abstraction: Interfaces for CRUD operations without needing implementation.
Custom Queries: Define queries using method names or @Query annotation.
Pagination and Sorting: Built-in support for these features.
Transaction Management: Declarative transaction management with Spring's @Transactional annotation.
Auditing: Automatically tracks entity changes using @CreatedBy, @LastModifiedBy, @CreatedDate, and @LastModifiedDate annotations.
QueryDSL: Type-safe querying using QueryDSL predicates.
Spring Data JPA Example

Mian Interface:
javax.persistence.EntityManager
javax.persistence.EntityManagerFactory
javax.persistence.EntityTransaction
javax.persistence.Persistence
javax.persistence.Query
javax.persistence.TypedQuery
javax.persistence.criteria.CriteriaBuilder
javax.persistence.criteria.CriteriaQuery
javax.persistence.criteria.Predicate
javax.persistence.criteria.Root
javax.persistence.criteria.Selection
javax.persistence.metamodel.EntityType
javax.persistence.metamodel.Metamodel
javax.persistence.metamodel.SingularAttribute
javax.persistence.metamodel.Type
javax.persistence.spi.PersistenceProvider
javax.persistence.spi.PersistenceProviderResolver
javax.persistence.spi.PersistenceProviderResolverHolder
javax.persistence.spi.ProviderUtil
javax.persistence.spi.Resolve

Entity Mapping:
javax.persistence.Access
javax.persistence.AccessType
javax.persistence.AssociationOverride
javax.persistence.AssociationOverrides
javax.persistence.AttributeConverter
javax.persistence.AttributeNode
javax.persistence.AttributeOverride
javax.persistence.AttributeOverrides
javax.persistence.Basic
javax.persistence.Cacheable
javax.persistence.CascadeType
javax.persistence.CollectionTable
javax.persistence.Column
javax.persistence.ColumnResult
javax.persistence.ConstructorResult
javaxjson.persistence.Convert
javax.persistence.Converter
javax.persistence.DiscriminatorColumn
javax.persistence.DiscriminatorType
javax.persistence.DiscriminatorValue
javax.persistence.ElementCollection
javax.persistence.Embeddable
javax.persistence.Embedded
javax.persistence.EmbeddedId
javax.persistence.Entity
javax.persistence.EntityListeners
javax.persistence.EntityResult
javax.persistence.EntityScan
javax.persistence.EnumType
javax.persistence.Enumerated
javax.persistence.ExcludeDefaultListeners
javax.persistence.ExcludeSuperclassListeners
javax.persistence.FetchType
javax.persistence.FieldResult
javax.persistence.ForeignKey
javax.persistence.GeneratedValue
javax.persistence.GenerationType
javax.persistence.Id


javax.persistence.Transaction 
javax.persistence.JoinColumn
javax.persistence.JoinColumns
javax.persistence.JoinTable
javax.persistence.Lob
javax.persistence.LockModeType
javax.persistence.ManyToMany
javax.persistence.ManyToOne
javax.persistence.MapKey
javax.persistence.MapKeyClass
javax.persistence.MapKeyColumn
javax.persistence.MapKeyEnumerated
javax.persistence.MapKeyJoinColumn
javax.persistence.MapKeyJoinColumns
javax.persistence.MapKeyTemporal
javax.persistence.MappedSuperclass
javax.persistence.MapsId
javax.persistence.NamedAttributeNode
javax.persistence.NamedEntityGraph
javax.persistence.NamedEntityGraphs
javax.persistence.NamedNativeQuery
javax.persistence.NamedQueries
javax.persistence.NamedQuery
javax.persistence.NamedStoredProcedureQuery

javax.persistence.EntityManagerFactory
javax.persistence.EntityManager
javax.persistence.EntityTransaction

