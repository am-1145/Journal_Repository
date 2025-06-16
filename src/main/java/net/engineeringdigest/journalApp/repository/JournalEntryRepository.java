package net.engineeringdigest.journalApp.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import net.engineeringdigest.journalApp.entity.JournalEntry;  // ✅ Import your entity class

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
    // Define custom query methods if needed

}
