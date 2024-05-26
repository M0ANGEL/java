const express = require("express");
const app = express();
const  mongoose = require("mongoose");
const cors= require("cors");
require("dotenv").config();
app.use(express.json());
app.use(cors());


const mongoUri = process.env.MONGODB_URI;

try {
    mongoose.connect(mongoUri);
    console.log('connected to mongo');
} catch (error) {
    console.error("error connecting to mongo",error);
}

    const libroSchema = new mongoose.Schema ({
    titulo: String,
    autor: String
    });

const Libro = mongoose.model("Libros", libroSchema);
//crear libro schema
app.post("/libros", async (req, res) => {
    const libros = new Libro({
        titulo: req.body.titulo,
         autor: req.body.autor
    })
    try {
        await libros.save();
        res.json(libros);
    } catch (error) {
        console.error("error save book");
    }
})
//ver libros creados
    app.get("/libros",async (req, res)=>{
        try {
            const libros = await Libros.find();
            res.json(libros);
        } catch (error) {
            console.status(500).send("error get books");
        }
    });
    //buscar libros
    app.get("/libros/:id", async (req, res) => {
        try {
          const libros = await Libros.findById(req.params.id);
          if (libros) {
            res.json(libros);
          } else {
            res.status(404).send("Libro no encontrado");
          }
        } catch (error) {
          res.status(500).send("Error al buscar el libros");
        }
      });

//actualizar libros
app.put("/libros/:id", async (req, res) => {
    try {
      const libros = await Libros.findByIdAndUpdate(
        req.params.id,
        {
          titulo: req.body.titulo,
          autor: req.body.autor,
        },
        { new: true } 
      );

      if (libros) {
        res.json(libros);
      } else {
        res.status(404).send("Libros no encontrado");
      }
    } catch (error) {
      res.status(500).send("Error al actualizar el libros");
    }
  });
  //eliminar libro
  app.delete("/libros/:id", async (req, res) => {
    try {
        const libros = await Libros.findOneAndDelete({ _id: req.params.id });
        if (libros) {
            res.status(204).send();
        } else {
            res.status(404).send("Libros no encontrado");
        }
    } catch (error) {
        console.error(error);
        res.status(500).send("Error al eliminar el libro");
    }
});

module.exports =app;
