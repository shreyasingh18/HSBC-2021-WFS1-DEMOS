// need to use mongodb library using require
var MongoClient = require("mongodb").MongoClient;

// connection url
var url = "mongodb://localhost:27017/";

// Insert record
/*
MongoClient.connect(url, function(err, con){
    if(err) {
        console.log(err);
        throw err;
    } else {
        var dbCon = con.db("mydb")
        dbCon.collection("emp")
        .insertOne({"_id":1, "name":"Alex"}, function(err, res){
            if(err) {
                console.log(err)
                throw err;
            } else {
                console.log(res);
                con.close();
            }
        });
    }
});
*/
// Find all records
MongoClient.connect(url, function(err, con){
    if(err) throw err;
    else {
        var dbCon = con.db("mydb");
        dbCon.collection("emp").find().toArray(function(err, res){
            if(err) throw err;
            else {
                console.log(res);
                con.close();
            }
        });
    }
});
