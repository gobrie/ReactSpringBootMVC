import React, { useState } from 'react';
import { Form, Button } from 'react-bootstrap'
import 'react-toastify/dist/ReactToastify.css';
import base_url from '../../service/serviceapi';
import axios from 'axios';
import { toast } from 'react-toastify';

function SignUp() {

  /*const [nome, setNome] = useState({})
  const [cpf, setCpf] = useState({})
  const [email, setEmail] = useState({})
  const [endereco, setEndereco] = useState({})*/

  const [usuario, setUsuario] = useState({})

    const handleForm = (param)=>{
        postData(usuario)
        param.preventDefault()
    }

    const postData = (data)=>{
        axios.post(`${base_url}/create`,data).then(
            (response)=>{
                toast.info("!! New Blog Posted Successfully")
            },(error)=>{
                toast.error("!! Something went wrong on Server. We are looking at it. !!")
            }
        )
    }


  return (
      <div className='form__container'>
          <h1>CADASTRE-SE</h1>
          <Form>
            
            <Form.Group className="mb-3" controlId="formBasicName">
              <Form.Label>Nome</Form.Label>
              <Form.Control type="text" placeholder="Digite seu nome" onChange={(e) => {setUsuario({...usuario,nome:e.target.value})}} />
            </Form.Group>   
            <Form.Group className="mb-3" controlId="formBasic">
              <Form.Label>CPF</Form.Label>
              <Form.Control type="text" placeholder="Digite seu CPF" onChange={(e) => {setUsuario({...usuario,cpf:e.target.value})}} />
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicEmail">
              <Form.Label>E-mail</Form.Label>
              <Form.Control type="e-mail" placeholder="Digite seu e-mail" onChange={(e) => {setUsuario({...usuario,email:e.target.value})}} />
            </Form.Group>
            <Form.Group className="mb-3" controlId="formBasicAdress">
              <Form.Label>Endereço</Form.Label>
              <Form.Control type="text" placeholder="Digite seu endereço" onChange={(e) => {setUsuario({...usuario,endereco:e.target.value})}}/>
            </Form.Group>


            <Button variant="primary" type="submit" onSubmit={handleForm}>
              Confirme
            </Button>
          </Form>
        </div>
  );
}

export default SignUp;
