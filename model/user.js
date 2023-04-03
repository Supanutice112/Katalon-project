const mongoose = require("mongoose");


const itemSchema = new mongoose.Schema({
    name: String
  
});

exports.Item = mongoose.model("item", itemSchema);